package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.Item;

import gxt.client.visual.interfaces.presenter.IItemPresenter;
import gxt.client.visual.interfaces.view.IItemView;

/**
 * @author eugenp
 */
public interface IItem extends IComponent, IItemView, IItemPresenter{
	
	/** mine */
	Item getComponent();

}
