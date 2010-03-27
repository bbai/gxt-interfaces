package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.TabItem;

import gxt.client.visual.interfaces.presenter.ITabItemPresenter;
import gxt.client.visual.interfaces.view.ITabItemView;

/**
 * @author eugenp
 */
public interface ITabItem extends ILayoutContainer, ITabItemView, ITabItemPresenter{
	
	/** mine */
	TabItem getComponent();

}
