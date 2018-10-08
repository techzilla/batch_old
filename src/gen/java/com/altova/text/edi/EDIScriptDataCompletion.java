////////////////////////////////////////////////////////////////////////
//
// EDIFactDataCompletion.java
//
// This file was generated by MapForce 2018r2sp1.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text.edi;

import com.altova.text.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EDIScriptDataCompletion extends DataCompletion {
		private EDIScriptSettings mSettings = null;
		

		public EDIScriptDataCompletion(TextDocument document, EDIScriptSettings settings, String structurename) {
			super(document, structurename);
			mSettings = settings;
		}

		public void completeData(ITextNode dataroot, Particle rootParticle) {
			completeMandatory(dataroot, rootParticle);
			completeEnvelope(dataroot, rootParticle);
		}
		
		protected void completeEnvelope (ITextNode envelope, Particle rootParticle) {
			if (!envelope.getName().equals(rootParticle.getName()))
				throw new com.altova.AltovaException("completeEnvelope: root node is not an envelope");

			Particle interchangeParticle = rootParticle.getNode().getChildren()[0];
			makeSureExists(envelope, interchangeParticle.getName());

			TextNodeList interchanges = envelope.getChildren().filterByName(interchangeParticle.getName());
			for (int i=0; i< interchanges.size(); ++i)
				completeInterchange(interchanges.getAt(i), interchangeParticle);
		}

		protected void completeInterchange(ITextNode interchange, Particle interchangeParticle) {
			Particle interchangeHeader = interchangeParticle.getFirstChildByName("UIB");
			Particle interchangeTrailer = interchangeParticle.getFirstChildByName("UIZ");
			
			if ( interchangeHeader != null && interchangeTrailer != null )
			{
				ITextNode header = interchange.getChildren().getFirstNodeByName(interchangeHeader.getName());
				ITextNode trailer = interchange.getChildren().getLastNodeByName(interchangeTrailer.getName());
				if (header != null && trailer != null)
				{
					header = makeSureExists(interchange, interchangeHeader.getName());
					trailer = makeSureExists(interchange, interchangeTrailer.getName());
				}
				
				for (String sMessageType : m_Document.getMessageTypes())
				{
					TextNodeList messages = interchange.getChildren().filterByName("Message_" + sMessageType);
					for (int i=0; i< messages.size(); ++i)
					{
						ITextNode message = messages.getAt(i);
						Particle messageParticle = m_Document.getMessage(sMessageType).getRootParticle();
						completeMandatory(message, messageParticle);
						completeMessage(sMessageType, message, messageParticle);
					}
				}
							
				if ( header == null && trailer == null )
					return;

				completeInterchangeHeader(header, interchangeHeader);
				completeInterchangeTrailer(trailer, interchangeTrailer);
			}
		}

		protected void completeInterchangeHeader(ITextNode header, Particle headerParticle) {
			ITextNode s001 = makeSureExists(header, "S001");
			ITextNode s002 = makeSureExists(header, "S002");
			ITextNode s003 = makeSureExists(header, "S003");
			ITextNode s300 = makeSureExists(header, "S300");

			completeS001(s001);
			completeS002(s002);
			completeS003(s003);
			completeS300(s300, headerParticle.getFirstChildByName("S300"));
			
			if (headerParticle.getFirstChildByName("S045") != null)
			{
				ITextNode s045 = makeSureExists(header, "S045");
				completeS045(s045);
			}
		}

		protected void completeInterchangeTrailer(ITextNode trailer, Particle trailerParticle) {
			ITextNode f0036 = makeSureExists(trailer, "F0036");

			conservativeSetValue(f0036, GetNumberOfFunctionGroupsOrMessages(trailer.getParent()));
		}

		protected void completeMessage(String sMessageType, ITextNode message, Particle messageParticle) {
			Particle messageHeader = messageParticle.getFirstChildByName("UIH");
			Particle messageTrailer = messageParticle.getFirstChildByName("UIT");

			ITextNode header = makeSureExists(message, messageHeader.getName());
			ITextNode trailer = makeSureExists(message, messageTrailer.getName());

			completeMessageHeader(sMessageType, header, messageHeader);
			completeMessageTrailer(trailer, messageTrailer);
		}

		protected void completeMessageHeader(String sMessageType, ITextNode header, Particle headerParticle) {
			ITextNode f0062 = makeSureExists(header, "F0062");
			ITextNode s306 = makeSureExists(header, "S306");
			ITextNode s300 = makeSureExists(header, "S300");

			String referenceNumber = header.getParent().getChildren().filterByName("UIT").getAt(0).getValue();
			if (referenceNumber.length() == 0)
				referenceNumber = "0";
			conservativeSetValue(f0062, referenceNumber);
			completeS306(sMessageType, s306);
			completeS300(s300, headerParticle.getFirstChildByName("S300"));
		}

		protected void completeMessageTrailer(ITextNode trailer, Particle trailerParticle) {
			ITextNode f0062 = makeSureExists(trailer, "F0062");
			ITextNode f0074 = makeSureExists(trailer, "F0074");

			conservativeSetValue(f0062, trailer.getParent().getChildren().filterByName("UIH").getAt(0).getChildren().filterByName("F0062").getAt(0).getValue());
			conservativeSetValue(f0074, getSegmentChildrenCount(trailer.getParent()));
		}

		protected void completeS001(ITextNode s001) {
			ITextNode f0001 = makeSureExists(s001, "F0001");
			ITextNode f0002 = makeSureExists(s001, "F0002");

			conservativeSetValue(f0001, mSettings.getControllingAgency() + mSettings.getSyntaxLevel());
			conservativeSetValue(f0002, mSettings.getSyntaxVersionNumber());
		}

		protected void completeS002(ITextNode s002) {
			ITextNode f0004 = makeSureExists(s002, "F0004");
			conservativeSetValue(f0004, "Sender");
		}
		
		protected void completeS003(ITextNode s003) {
			ITextNode f0010 = makeSureExists(s003, "F0010");
			conservativeSetValue(f0010, "Recipient");
		}
		
		protected void completeS045(ITextNode s045) {
			ITextNode f8006 = makeSureExists(s045, "F8006");
			ITextNode f8007 = makeSureExists(s045, "F8007");
			ITextNode f8008 = makeSureExists(s045, "F8008");
			conservativeSetValue(f8006, "Altova GmbH");
			conservativeSetValue(f8007, "MapForce");
			conservativeSetValue(f8008, "2018r2sp1");
		}
		
		protected void completeS300(ITextNode s300, Particle particle) {
			Particle timeField = particle.getFirstChildByName("F0114");
			if(timeField == null) timeField = particle.getFirstChildByName("F0314");
			ITextNode date = makeSureExists(s300, "F0017");
			ITextNode time = makeSureExists(s300, timeField.getName());

			Date now = new Date();
			SimpleDateFormat dateformatter = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat timeformatter = new SimpleDateFormat("HHmmss");
			conservativeSetValue(date, dateformatter.format(now));
			conservativeSetValue(time, timeformatter.format(now));
		}

		protected void completeS306(String sMessageType, ITextNode s306) {
			ITextNode f0329 = makeSureExists(s306, "F0329");
			ITextNode f0316 = makeSureExists(s306, "F0316");
			ITextNode f0318 = makeSureExists(s306, "F0318");
			ITextNode f0326 = makeSureExists(s306, "F0326");
			
			conservativeSetValue(f0329, "SCRIPT");
			conservativeSetValue(f0316, mSettings.getVersion());
			conservativeSetValue(f0318, mSettings.getRelease());
			conservativeSetValue(f0326, sMessageType);
		}

		long GetNumberOfFunctionGroupsOrMessages(ITextNode node) {
			int nUIH =0;
			int nUIT =0;

			for (String sMessageType : m_Document.getMessageTypes())
			{
				TextNodeList messageNodes = node.getChildren().filterByName("Message_" + sMessageType);
				for (int i=0; i< messageNodes.size(); ++i)
				{
					ITextNode messageNode = messageNodes.getAt(i);
					nUIH += messageNode.getChildren().filterByName("UIH").size();
					nUIT += messageNode.getChildren().filterByName("UIT").size();
				}
			}

			TextNodeList messageNodes = node.getChildren().filterByName("Message");
			for (int i=0; i< messageNodes.size(); ++i)
			{
				ITextNode messageNode = messageNodes.getAt(i);
				nUIH += messageNode.getChildren().filterByName("UIH").size();
				nUIT += messageNode.getChildren().filterByName("UIT").size();
			}
			
			if (nUIH != nUIT)
				throw new com.altova.AltovaException("Message header-trailer mismatch");

			return nUIH;
		}
}
