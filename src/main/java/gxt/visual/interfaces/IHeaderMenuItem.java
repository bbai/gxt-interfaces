package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.HeaderMenuItem;

import gxt.visual.interfaces.presenter.IHeaderMenuItemPresenter;
import gxt.visual.interfaces.view.IHeaderMenuItemView;

public interface IHeaderMenuItem extends IItem, IHeaderMenuItemView, IHeaderMenuItemPresenter{
	
	/** mine */
	HeaderMenuItem getComponent();

}
