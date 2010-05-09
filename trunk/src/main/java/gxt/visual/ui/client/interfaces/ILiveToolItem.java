package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.LiveToolItem;

import gxt.visual.ui.client.interfaces.presenter.ILiveToolItemPresenter;
import gxt.visual.ui.client.interfaces.view.ILiveToolItemView;

/**
 * @author eugenp
 */
public interface ILiveToolItem extends ILabelToolItem, ILiveToolItemView, ILiveToolItemPresenter{
	
	/** mine */
	LiveToolItem getComponent();

}
