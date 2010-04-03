package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.AdapterMenuItem;
import gxt.client.visual.interfaces.presenter.IAdapterMenuItemPresenter;
import gxt.client.visual.interfaces.view.IAdapterMenuItemView;

/**
 * @author eugenp
 */
public interface IAdapterMenuItem extends IItem, IAdapterMenuItemView, IAdapterMenuItemPresenter{
	
	/** mine */
	AdapterMenuItem getComponent();

}
