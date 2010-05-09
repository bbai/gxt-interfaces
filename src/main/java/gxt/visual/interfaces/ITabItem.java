package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.TabItem;

import gxt.visual.interfaces.presenter.ITabItemPresenter;
import gxt.visual.interfaces.view.ITabItemView;

/**
 * @author eugenp
 */
public interface ITabItem extends ILayoutContainer, ITabItemView, ITabItemPresenter, IconSupport{
	
	/** mine */
	TabItem getComponent();

}
