package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.SeparatorMenuItem;

import gxt.visual.ui.client.interfaces.presenter.ISeparatorMenuItemPresenter;
import gxt.visual.ui.client.interfaces.view.ISeparatorMenuItemView;

/**
 * @author eugenp
 */
public interface ISeparatorMenuItem extends IItem, ISeparatorMenuItemView, ISeparatorMenuItemPresenter{
	
	/** mine */
	SeparatorMenuItem getComponent();

}
