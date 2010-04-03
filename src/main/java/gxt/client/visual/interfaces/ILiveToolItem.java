package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.toolbar.LiveToolItem;

import gxt.client.visual.interfaces.presenter.ILiveToolItemPresenter;
import gxt.client.visual.interfaces.view.ILiveToolItemView;

/**
 * @author eugenp
 */
public interface ILiveToolItem extends ILabelToolItem, ILiveToolItemView, ILiveToolItemPresenter{
	
	/** mine */
	LiveToolItem getComponent();

}
