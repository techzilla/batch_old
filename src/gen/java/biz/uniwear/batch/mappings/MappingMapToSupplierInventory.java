/**
 * MappingMapToSupplierInventory.java
 *
 * This file was generated by MapForce 2018r2sp1.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package biz.uniwear.batch.mappings;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import com.altova.text.tablelike.*;
import com.altova.text.*;
import com.altova.text.edi.*;
import java.util.*;

public class MappingMapToSupplierInventory extends com.altova.TraceProvider 
{
	private boolean runDoesCloseAll = true;
	public void setCloseObjectsAfterRun(boolean c) {runDoesCloseAll = c;}
	public boolean getCloseObjectsAfterRun() {return runDoesCloseAll;}

	
	static class main implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_InventorySPI_Instance;
	
		public main(com.altova.mapforce.IMFNode var1_InventorySPI_Instance)
		{
			this.var1_InventorySPI_Instance = var1_InventorySPI_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 2;
			Object current;
			main closure;
			public Enumerator(main closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 2:	if (moveNext_2()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_2() throws Exception {
				state = 0;				
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("supplierinventory", ""), (new seq1_join(closure.var1_InventorySPI_Instance)));
				pos++;
				return true;
			}

			
			public void close()
			{
				try
				{
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class seq1_join implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_InventorySPI_Instance;
	
		public seq1_join(com.altova.mapforce.IMFNode var1_InventorySPI_Instance)
		{
			this.var1_InventorySPI_Instance = var1_InventorySPI_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			seq1_join closure;
			IEnumerator var2_filter_elements_nodename;
			IEnumerator var3_filter_elements_nodename;
			IEnumerator var4_filter_elements_nodename;
			public Enumerator(seq1_join closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
					case 4:	if (moveNext_4()) return true; break;
					case 5:	if (moveNext_5()) return true; break;
					case 6:	if (moveNext_6()) return true; break;
					case 8:	if (moveNext_8()) return true; break;
					case 9:	if (moveNext_9()) return true; break;
					case 10:	if (moveNext_10()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				current = com.altova.functions.Core.createAttribute(com.altova.functions.Core.createQName("xsi:noNamespaceSchemaLocation", "http://www.w3.org/2001/XMLSchema-instance"), com.altova.functions.Core.box("file:///C:/Users/User/Projects/batch/mappings/project/Mappings/schema/SupplierInventory.xsd"));
				pos++;
				return true;
			}
			private boolean moveNext_2() throws Exception {
				state = 3;				
				var2_filter_elements_nodename = (com.altova.functions.Core.filterElements("Rows", closure.var1_InventorySPI_Instance)).enumerator();
				return false;
			}
			private boolean moveNext_3() throws Exception {
				state = 5;				
				if (!var2_filter_elements_nodename.moveNext()) {state = 4; return false; }
				var3_filter_elements_nodename = (com.altova.functions.Core.filterElements("UPC", ((com.altova.mapforce.IMFNode)(var2_filter_elements_nodename.current())))).enumerator();
				return false;
			}
			private boolean moveNext_4() throws Exception {
				state = 0;				
				if( var2_filter_elements_nodename != null ) { var2_filter_elements_nodename.close(); var2_filter_elements_nodename = null; }
				return false;
			}
			private boolean moveNext_5() throws Exception {
				state = 5;				
				if (!var3_filter_elements_nodename.moveNext()) {state = 6; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("gtin", ""), com.altova.functions.Core.box(com.altova.functions.Core.translate(com.altova.functions.Core.FormatNumber(com.altova.CoreTypes.integerToDecimal(com.altova.CoreTypes.parseInteger(com.altova.CoreTypes.nodeToString(((com.altova.mapforce.IMFNode)(var3_filter_elements_nodename.current()))))), "##############"), ".,", com.altova.functions.Core.concat((java.lang.String)com.altova.functions.Core.first(biz.uniwear.batch.mappings.core.firstCharacter.eval(".", ".")), (java.lang.String)com.altova.functions.Core.first(biz.uniwear.batch.mappings.core.firstCharacter.eval(",", ","))))));
				pos++;
				return true;
			}
			private boolean moveNext_6() throws Exception {
				state = 8;				
				if( var3_filter_elements_nodename != null ) { var3_filter_elements_nodename.close(); var3_filter_elements_nodename = null; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("supplier", ""), com.altova.functions.Core.box("SPI"));
				pos++;
				return true;
			}
			private boolean moveNext_8() throws Exception {
				state = 9;				
				var4_filter_elements_nodename = (com.altova.functions.Core.filterElements("Price ", ((com.altova.mapforce.IMFNode)(var2_filter_elements_nodename.current())))).enumerator();
				return false;
			}
			private boolean moveNext_9() throws Exception {
				state = 9;				
				if (!var4_filter_elements_nodename.moveNext()) {state = 10; return false; }
				current = com.altova.functions.Core.createElement(com.altova.functions.Core.createQName("price", ""), com.altova.functions.Core.box(com.altova.CoreTypes.doubleToString(com.altova.CoreTypes.decimalToDouble(com.altova.CoreTypes.parseDecimal(com.altova.CoreTypes.nodeToString(((com.altova.mapforce.IMFNode)(var4_filter_elements_nodename.current()))))))));
				pos++;
				return true;
			}
			private boolean moveNext_10() throws Exception {
				state = 3;				
				if( var4_filter_elements_nodename != null ) { var4_filter_elements_nodename.close(); var4_filter_elements_nodename = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var3_filter_elements_nodename != null ) { var3_filter_elements_nodename.close(); var3_filter_elements_nodename = null; }
				if( var4_filter_elements_nodename != null ) { var4_filter_elements_nodename.close(); var4_filter_elements_nodename = null; }
				if( var2_filter_elements_nodename != null ) { var2_filter_elements_nodename.close(); var2_filter_elements_nodename = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}
	static class Outer implements IEnumerable
	{
		com.altova.mapforce.IMFNode var1_InventorySPI_Instance;
	
		public Outer(com.altova.mapforce.IMFNode var1_InventorySPI_Instance)
		{
			this.var1_InventorySPI_Instance = var1_InventorySPI_Instance;
		}

		public IEnumerator enumerator() {return new Enumerator(this);}
		
		public static class Enumerator implements IEnumerator
		{
			int pos = 0;
			int state = 1;
			Object current;
			Outer closure;
			IEnumerator var2_box;
			public Enumerator(Outer closure) 
			{
				this.closure = closure;
			}
			
			public Object current() {return current;}
			
			public int position() {return pos;}
			
			public boolean moveNext() throws Exception
			{
				while (state != 0)
				{
					switch (state) 
					{
					case 1:	if (moveNext_1()) return true; break;
					case 2:	if (moveNext_2()) return true; break;
					case 3:	if (moveNext_3()) return true; break;
 					}
				}
				return false;
			}

			private boolean moveNext_1() throws Exception {
				state = 2;				
				var2_box = ((new main(closure.var1_InventorySPI_Instance))).enumerator();
				return false;
			}
			private boolean moveNext_2() throws Exception {
				state = 2;				
				if (!var2_box.moveNext()) {state = 3; return false; }
				current = var2_box.current();
				pos++;
				return true;
			}
			private boolean moveNext_3() throws Exception {
				state = 0;				
				if( var2_box != null ) { var2_box.close(); var2_box = null; }
				return false;
			}

			
			public void close()
			{
				try
				{
				if( var2_box != null ) { var2_box.close(); var2_box = null; }
				}
				catch (Exception e)
				{
				}
			}
		}
				
	}



	// instances
	protected com.altova.text.tablelike.Table varInventorySPI2Instance;

	public void run(String InventorySPI2SourceFilename, String SupplierInventory2TargetFilename) throws Exception {
		// open source streams
		writeTrace("Loading " + InventorySPI2SourceFilename + "...\n");
		com.altova.io.FileInput InventorySPI2Source = new com.altova.io.FileInput(InventorySPI2SourceFilename);
		// open target stream
		com.altova.io.FileOutput SupplierInventory2Target = new com.altova.io.FileOutput(SupplierInventory2TargetFilename);

		// run
	
		run(InventorySPI2Source, SupplierInventory2Target);

		// close source streams
		InventorySPI2Source.close();
		// close target stream
		writeTrace("Saving " + SupplierInventory2TargetFilename + "...\n");
		SupplierInventory2Target.close();
	}


	// main entry point

	public void run(com.altova.io.Input InventorySPI2Source, com.altova.io.Output SupplierInventory2Target) throws Exception {
		// Open the source(s)
		writeTrace("Parsing Text...\n");
		com.altova.text.tablelike.csv.Table InventorySPI2InstanceObject = new com.altova.text.tablelike.csv.Table(biz.uniwear.batch.mappings.InventorySPI.InventorySPI_TypeInfo.binder.getTypes()[biz.uniwear.batch.mappings.InventorySPI.InventorySPI_TypeInfo._altova_ti_altova_RowsType],0);
		varInventorySPI2Instance = InventorySPI2InstanceObject;
		com.altova.text.tablelike.Table InventorySPI2SourceObject = varInventorySPI2Instance;
			InventorySPI2InstanceObject.getFormat().setAssumeFirstRowAsHeaders( true );
			InventorySPI2InstanceObject.getFormat().setFieldDelimiter( ',' );
			InventorySPI2InstanceObject.getFormat().setRemoveEmpty( true );
			InventorySPI2InstanceObject.getFormat().setQuoteCharacter( '\"' );
		varInventorySPI2Instance.setEncoding( "UTF-8", false, false );
		varInventorySPI2Instance.parse(InventorySPI2Source);
		if (runDoesCloseAll)
			InventorySPI2Source.close();

		// Create the target
		org.w3c.dom.Document SupplierInventory2Doc = (SupplierInventory2Target.getType() == com.altova.io.Output.IO_DOM) ? SupplierInventory2Target.getDocument() : XmlTreeOperations.createDocument();

		// Execute mapping

		main mapping = new main(new com.altova.text.TableAsMFNodeAdapter(varInventorySPI2Instance, InventorySPI2Source.getFilename()));

		com.altova.xml.MFDOMWriter.write(mapping, SupplierInventory2Doc);
		// Close the target
		XmlTreeOperations.saveDocument(SupplierInventory2Doc, SupplierInventory2Target, "UTF-8", false, false, true, false);

		
		if (runDoesCloseAll)
		{
			InventorySPI2Source.close();
			SupplierInventory2Target.close();
		}
	}



}