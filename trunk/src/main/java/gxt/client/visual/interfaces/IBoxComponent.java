package gxt.client.visual.interfaces;

/**
 * @author eugenp
 */
public interface IBoxComponent extends IComponent{
	
	void setHeight( final int height );
	void setAutoHeight( final boolean autoHeight );
	
	void setWidth( final int width );
	void setSize( final int width, final int height );

}
