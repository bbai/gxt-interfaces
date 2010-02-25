package gxt.client.visual.interfaces;

public interface INumberField extends ITextField< Number >{
	
	void setAllowNegative( final boolean b );
	
	void setPropertyEditorType( final Class< ? > type );
	
}
