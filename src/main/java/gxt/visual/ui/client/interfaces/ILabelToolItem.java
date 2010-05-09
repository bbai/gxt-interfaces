package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.ILabelToolItemPresenter;
import gxt.visual.ui.client.interfaces.view.ILabelToolItemView;

import com.extjs.gxt.ui.client.widget.toolbar.LabelToolItem;

/**
 * @author eugenp
 */
public interface ILabelToolItem extends IBoxComponent, ILabelToolItemView, ILabelToolItemPresenter{
	
	/** mine */
	LabelToolItem getComponent();

}
