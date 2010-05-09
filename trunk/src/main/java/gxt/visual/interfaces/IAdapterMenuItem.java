package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.AdapterMenuItem;

import gxt.visual.interfaces.presenter.IAdapterMenuItemPresenter;
import gxt.visual.interfaces.view.IAdapterMenuItemView;

/**
 * @author eugenp
 */
public interface IAdapterMenuItem extends IItem, IAdapterMenuItemView, IAdapterMenuItemPresenter{
	
	/** mine */
	AdapterMenuItem getComponent();

}
