package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;

import gxt.client.visual.interfaces.presenter.ISeparatorToolItemPresenter;
import gxt.client.visual.interfaces.view.ISeparatorToolItemView;

/**
 * @author eugenp
 */
public interface ISeparatorToolItem extends IComponent, ISeparatorToolItemView, ISeparatorToolItemPresenter{
	
	/** mine */
	SeparatorToolItem getComponent();

}
