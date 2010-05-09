package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.IconSupport;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;

import gxt.visual.interfaces.presenter.IMenuItemPresenter;
import gxt.visual.interfaces.view.IMenuItemView;

/**
 * @author eugenp
 */
public interface IMenuItem extends IItem, IMenuItemView, IMenuItemPresenter, IconSupport{
	
	/** mine */
	MenuItem getComponent();
	
}
