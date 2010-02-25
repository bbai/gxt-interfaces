package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.core.El;
import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Header;
import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.button.ButtonBar;

/**
 * @author eugenp
 */
public interface IContentPanel extends ILayoutContainer, IconSupport{
	
	Component getTopComponent();
	void setTopComponent( final Component topComponent );
	
	Component getBottomComponent();
	void setBottomComponent( final Component bottomComponent );
	
	Header getHeader();
	void setHeaderVisible( final boolean headerVisible );
	void setHeading( final String text );
	
	El getBody();
	
	ButtonBar getButtonBar();
	
	void setFrame( final boolean frame );
	
	void setButtonAlign( final HorizontalAlignment buttonAlign );
	
	void addButton( final Button button );

}
