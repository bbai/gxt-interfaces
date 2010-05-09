package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.menu.Item;

import gxt.visual.ui.client.interfaces.presenter.IItemPresenter;
import gxt.visual.ui.client.interfaces.view.IItemView;

/**
 * @author eugenp
 */
public interface IItem extends IComponent, IItemView, IItemPresenter{
	
	/** mine */
	Item getComponent();

}
