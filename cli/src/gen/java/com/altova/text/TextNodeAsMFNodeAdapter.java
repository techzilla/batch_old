////////////////////////////////////////////////////////////////////////
//
// TextNodeAsMFNodeAdapter.java
//
// This file was generated by MapForce 2019.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text;

import javax.xml.namespace.QName;
import com.altova.text.ITextNode;
import com.altova.mapforce.IEnumerable;
import com.altova.mapforce.IMFNode;
import com.altova.mapforce.MFNode;
import com.altova.mapforce.MFEmptySequence;
import com.altova.mapforce.MFNodeByKindAndQNameFilter;
import com.altova.mapforce.MFNodeByKindAndNodeNameFilter;
import com.altova.mapforce.MFSingletonSequence;

public class TextNodeAsMFNodeAdapter implements IMFNode 
{
	public static class TextNodeValueAsMFNodeAdapter implements IMFNode
	{
		ITextNode node;
		
		public TextNodeValueAsMFNodeAdapter(ITextNode node) { this.node = node; }
		public String getLocalName() { return node.getName() == null ? "" : node.getName(); }
		public String getNamespaceURI() { return ""; }
		public String getPrefix() { return ""; }
		public int getNodeKind() { return MFNodeKind_Text; }
		public String getNodeName() { return getLocalName(); }
		public QName getQName() { return new QName(getNamespaceURI(), getLocalName()); }
		public IEnumerable select(int mfQueryKind, Object query) 
		{
			switch (mfQueryKind)
			{
				case MFQueryKind_All:
				case MFQueryKind_AllChildren:
				case MFQueryKind_AllAttributes:
					return new MFSingletonSequence(node.getValue());

				case MFQueryKind_SelfByQName:
					if (getQName().equals(query))
						return new MFSingletonSequence(this);
					else
						return new MFEmptySequence();
				default:
					throw new UnsupportedOperationException("Unsupported query type."); 
			}
		}
		
		public String value() throws Exception { return node.getValue(); }
		public javax.xml.namespace.QName qnameValue() { return null; }
		public Object typedValue() throws Exception	
		{ 
		return MFNode.collectTypedValue(select(IMFNode.MFQueryKind_AllChildren, null));
		}	
	}
	
	ITextNode node;
	
	public TextNodeAsMFNodeAdapter(ITextNode node)
	{
		this.node = node;
	}
	
	public String getLocalName() 
	{
		return node.getName() == null ? "" : node.getName();
	}

	public String getNamespaceURI() 
	{
		return ""; 
	}
	
	public String getPrefix() 
	{
		return ""; 
	}

	public String getNodeName() { return getLocalName(); }

	public int getNodeKind() 
	{
		return MFNodeKind_Element;
	}

	public QName getQName() 
	{
		return new QName(getNamespaceURI(), getLocalName());
	}

	public IEnumerable select(int mfQueryKind, Object query) 
	{
		switch (mfQueryKind)
		{
			
			case MFQueryKind_All:
			case MFQueryKind_AllChildren:
				if (node.getChildren().size() > 0)
					return new TextChildrenAsMFNodeSequenceAdapter(node);
				else
					return new MFSingletonSequence(new TextNodeValueAsMFNodeAdapter(node));
					
			case MFQueryKind_AllAttributes:
				return new MFEmptySequence();

			case MFQueryKind_AttributeByQName:
			case MFQueryKind_AttributeByNodeName:
				return new MFEmptySequence();
			
			case MFQueryKind_ChildrenByQName:
				return new MFNodeByKindAndQNameFilter(new TextChildrenAsMFNodeSequenceAdapter(node), MFNodeKind_Element,
						(javax.xml.namespace.QName) query);

			case MFQueryKind_ChildrenByNodeName:
				return new MFNodeByKindAndNodeNameFilter(new TextChildrenAsMFNodeSequenceAdapter(node), MFNodeKind_Element,
						(java.lang.String) query);

			case MFQueryKind_SelfByQName:
				if (getQName().equals(query))
					return new MFSingletonSequence(this);
				else
					return new MFEmptySequence();

			default:
				throw new UnsupportedOperationException("Unsupported query type."); 
		}
	}
	
	public String value() throws Exception {return node.getValue();}
	
	public javax.xml.namespace.QName qnameValue()
	{
		return null;
	}
	
	public Object typedValue() throws Exception
	{
		return MFNode.collectTypedValue(select(IMFNode.MFQueryKind_AllChildren, null));
	}
}
