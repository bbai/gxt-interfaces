package gxt.client.visual.interfaces;

/**
 * @author eugenp
 */
public interface IToggleButton extends IButton{
	
	boolean isPressed();
	void setAllowDepress( final boolean allowDepress );
	void toggle( final boolean state );
}
