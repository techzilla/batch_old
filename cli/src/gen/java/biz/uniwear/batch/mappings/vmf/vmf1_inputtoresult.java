/**
 * vmf/vmf1_inputtoresult.java
 *
 * This file was generated by MapForce 2019.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */
package biz.uniwear.batch.mappings.vmf;
import com.altova.mapforce.*;
import com.altova.types.*;
import com.altova.xml.*;
import com.altova.db.*;
import com.altova.text.tablelike.*;
import com.altova.text.*;
import com.altova.text.edi.*;
import java.util.*;

public class vmf1_inputtoresult extends com.altova.TraceProvider 
{

	
	static class Main implements IEnumerable
	{
		java.lang.String var1_input;
	
		public Main(java.lang.String var1_input)
		{
			this.var1_input = var1_input;
		}

		public IEnumerator enumerator() {return new MFEmptySequence().enumerator();}
				
	}





	public static IEnumerable create(java.lang.String var1_input)
	{
		if (hash == null) init();
		Object o = hash.get(var1_input);
		if (o != null)
			return new MFSingletonSequence(o);
		else
			return new MFSingletonSequence(com.altova.CoreTypes.box("___"));

	}
	
	private static java.util.HashMap<Object,Object> hash = null;

	private synchronized static void init()
	{
		hash = new java.util.HashMap<Object,Object>();
		hash.put(com.altova.CoreTypes.box("adc"), com.altova.CoreTypes.box("ADC"));
		hash.put(com.altova.CoreTypes.box("anywear"), com.altova.CoreTypes.box("ANY"));
		hash.put(com.altova.CoreTypes.box("asics"), com.altova.CoreTypes.box("ASI"));
		hash.put(com.altova.CoreTypes.box("boojee"), com.altova.CoreTypes.box("BOO"));
		hash.put(com.altova.CoreTypes.box("careisma"), com.altova.CoreTypes.box("CAR"));
		hash.put(com.altova.CoreTypes.box("celeste stien"), com.altova.CoreTypes.box("CEL"));
		hash.put(com.altova.CoreTypes.box("cherokee"), com.altova.CoreTypes.box("CHE"));
		hash.put(com.altova.CoreTypes.box("cherokee workwear"), com.altova.CoreTypes.box("CHW"));
		hash.put(com.altova.CoreTypes.box("code happy"), com.altova.CoreTypes.box("COD"));
		hash.put(com.altova.CoreTypes.box("dickies"), com.altova.CoreTypes.box("DIC"));
		hash.put(com.altova.CoreTypes.box("dickies chef"), com.altova.CoreTypes.box("DCH"));
		hash.put(com.altova.CoreTypes.box("elle"), com.altova.CoreTypes.box("ELL"));
		hash.put(com.altova.CoreTypes.box("fila usa"), com.altova.CoreTypes.box("FIL"));
		hash.put(com.altova.CoreTypes.box("heartsoul"), com.altova.CoreTypes.box("HRT"));
		hash.put(com.altova.CoreTypes.box("infinity footwear"), com.altova.CoreTypes.box("INF"));
		hash.put(com.altova.CoreTypes.box("k-swiss"), com.altova.CoreTypes.box("KSW"));
		hash.put(com.altova.CoreTypes.box("littmann"), com.altova.CoreTypes.box("LTT"));
		hash.put(com.altova.CoreTypes.box("MDF"), com.altova.CoreTypes.box("MDF"));
		hash.put(com.altova.CoreTypes.box("med-man"), com.altova.CoreTypes.box("MAN"));
		hash.put(com.altova.CoreTypes.box("reebok"), com.altova.CoreTypes.box("RBK"));
		hash.put(com.altova.CoreTypes.box("runway"), com.altova.CoreTypes.box("RUN"));
		hash.put(com.altova.CoreTypes.box("sapphire"), com.altova.CoreTypes.box("SPH"));
		hash.put(com.altova.CoreTypes.box("scrub hq"), com.altova.CoreTypes.box("SHQ"));
		hash.put(com.altova.CoreTypes.box("scrubstar"), com.altova.CoreTypes.box("SST"));
		hash.put(com.altova.CoreTypes.box("sloggers"), com.altova.CoreTypes.box("SLG"));
		hash.put(com.altova.CoreTypes.box("studio"), com.altova.CoreTypes.box("STU"));
		hash.put(com.altova.CoreTypes.box("swiftkick"), com.altova.CoreTypes.box("SWK"));
		hash.put(com.altova.CoreTypes.box("therafirm"), com.altova.CoreTypes.box("THF"));
		hash.put(com.altova.CoreTypes.box("tooniforms"), com.altova.CoreTypes.box("TOO"));
	}

	public static java.lang.String eval(java.lang.String var1_input) throws java.lang.Exception
	{

		com.altova.mapforce.IEnumerator e = create(var1_input).enumerator();
		if (e.moveNext())
		{
			java.lang.String result = ((java.lang.String)e.current());
			e.close();
			return result;
		}
		e.close();
		throw new com.altova.AltovaException("Expected a function result.");		
	
	}

}
