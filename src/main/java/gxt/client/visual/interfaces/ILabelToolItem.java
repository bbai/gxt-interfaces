package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.ILabelToolItemPresenter;
import gxt.client.visual.interfaces.view.ILabelToolItemView;

import com.extjs.gxt.ui.client.widget.toolbar.LabelToolItem;

/**
 * @author eugenp
 */
public interface ILabelToolItem extends IBoxComponent, ILabelToolItemView, ILabelToolItemPresenter{
	
	/** mine */
	LabelToolItem getComponent();

}
