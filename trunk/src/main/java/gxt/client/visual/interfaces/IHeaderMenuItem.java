package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.HeaderMenuItem;
import gxt.client.visual.interfaces.presenter.IHeaderMenuItemPresenter;
import gxt.client.visual.interfaces.view.IHeaderMenuItemView;

public interface IHeaderMenuItem extends IItem, IHeaderMenuItemView, IHeaderMenuItemPresenter{
	
	/** mine */
	HeaderMenuItem getComponent();

}
