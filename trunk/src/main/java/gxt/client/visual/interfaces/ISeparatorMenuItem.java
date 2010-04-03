package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.SeparatorMenuItem;

import gxt.client.visual.interfaces.presenter.ISeparatorMenuItemPresenter;
import gxt.client.visual.interfaces.view.ISeparatorMenuItemView;

/**
 * @author eugenp
 */
public interface ISeparatorMenuItem extends IItem, ISeparatorMenuItemView, ISeparatorMenuItemPresenter{
	
	/** mine */
	SeparatorMenuItem getComponent();

}
