package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.SeparatorToolItem;

import gxt.visual.interfaces.presenter.ISeparatorToolItemPresenter;
import gxt.visual.interfaces.view.ISeparatorToolItemView;

/**
 * @author eugenp
 */
public interface ISeparatorToolItem extends IComponent, ISeparatorToolItemView, ISeparatorToolItemPresenter{
	
	/** mine */
	SeparatorToolItem getComponent();

}
