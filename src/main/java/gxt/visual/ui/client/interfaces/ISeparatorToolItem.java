package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;

import gxt.visual.ui.client.interfaces.presenter.ISeparatorToolItemPresenter;
import gxt.visual.ui.client.interfaces.view.ISeparatorToolItemView;

/**
 * @author eugenp
 */
public interface ISeparatorToolItem extends IComponent, ISeparatorToolItemView, ISeparatorToolItemPresenter{
	
	/** mine */
	SeparatorToolItem getComponent();

}
