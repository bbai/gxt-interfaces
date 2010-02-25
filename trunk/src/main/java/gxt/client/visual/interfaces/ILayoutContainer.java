package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.Component;
import com.extjs.gxt.ui.client.widget.Layout;
import com.extjs.gxt.ui.client.widget.layout.LayoutData;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author eugenp
 */
public interface ILayoutContainer extends IScrollContainer< Component >{
	
	boolean layout();
	void setLayout( final Layout layout );
	
	boolean add( final Widget widget );
	boolean add( final Widget widget, final LayoutData layoutData );
	
}
