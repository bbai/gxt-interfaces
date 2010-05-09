package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.HeaderMenuItem;

import gxt.visual.ui.client.interfaces.presenter.IHeaderMenuItemPresenter;
import gxt.visual.ui.client.interfaces.view.IHeaderMenuItemView;

public interface IHeaderMenuItem extends IItem, IHeaderMenuItemView, IHeaderMenuItemPresenter{
	
	/** mine */
	HeaderMenuItem getComponent();

}
