package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.menu.Item;

import gxt.visual.interfaces.presenter.IItemPresenter;
import gxt.visual.interfaces.view.IItemView;

/**
 * @author eugenp
 */
public interface IItem extends IComponent, IItemView, IItemPresenter{
	
	/** mine */
	Item getComponent();

}
