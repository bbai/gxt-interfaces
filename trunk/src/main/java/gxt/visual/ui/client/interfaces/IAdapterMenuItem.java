package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.AdapterMenuItem;

import gxt.visual.ui.client.interfaces.presenter.IAdapterMenuItemPresenter;
import gxt.visual.ui.client.interfaces.view.IAdapterMenuItemView;

/**
 * @author eugenp
 */
public interface IAdapterMenuItem extends IItem, IAdapterMenuItemView, IAdapterMenuItemPresenter{
	
	/** mine */
	AdapterMenuItem getComponent();

}
