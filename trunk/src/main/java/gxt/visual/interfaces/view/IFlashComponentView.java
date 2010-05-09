package gxt.visual.interfaces.view;

import com.extjs.gxt.ui.client.widget.flash.FlashComponent.WMode;

/**
 * @author eugenp
 */
public interface IFlashComponentView extends IBoxComponentView{
	
	/**
	 * Gets the express install url.
	 * @return the express install url.
	 */
	String getExpressInstall();
	
	/**
	 * Returns the flash version.
	 * @return the flash version
	 */
	String getFlashVersion();
	
	/**
	 * Returns the width of the flash object.
	 * @return the width of the flash object
	 */
	String getSwfHeight();
	
	/**
	 * Returns the flash id.
	 * @return the flash id
	 */
	String getSwfId();
	
	/**
	 * Returns the flash object width.
	 * @return the flash object width
	 */
	String getSwfWidth();
	
	/**
	 * Returns the wmode.
	 * @return the wmode
	 */
	WMode getWmode();
	
	/**
	 * Returns true if the IE fix is enabled.
	 * @return the IE fix enabled state
	 */
	boolean isIeFixEnabled();
	
	/**
	 * Add support for express install.
	 * @param url the url of the express install file
	 */
	void setExpressInstall( String url );
	
	/**
	 * Sets the flash version.
	 * @param flashVersion the flash version
	 */
	void setFlashVersion( String flashVersion );
	
	/**
	 * Sets if an IE fix should be used to ensure flash-to-JS interaction works. Enabled by default.
	 * @param enabled true to enable the IE fix
	 */
	void setIeFixEnabled( boolean enabled );
	
	/**
	 * Sets the flash object height (defaults to '100%').
	 * @param swfHeight the height
	 */
	void setSwfHeight( String swfHeight );
	
	/**
	 * Sets the flash id (- will be removed and are not allowed).
	 * @param swfId the flash id
	 */
	void setSwfId( String swfId );
	
	/**
	 * Sets the flash object width (defaults to '100%').
	 * @param swfWidth the width
	 */
	void setSwfWidth( String swfWidth );
	
	/**
	 * Sets the wmode (defaults to WMode.TRANSPARENT).
	 * @param wmode the wmode
	 */
	void setWmode( WMode wmode );
	
}
