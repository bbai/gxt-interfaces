package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.TabItem;

import gxt.visual.ui.client.interfaces.presenter.ITabItemPresenter;
import gxt.visual.ui.client.interfaces.view.ITabItemView;

/**
 * @author eugenp
 */
public interface ITabItem extends ILayoutContainer, ITabItemView, ITabItemPresenter, IconSupport{
	
	/** mine */
	TabItem getComponent();

}
