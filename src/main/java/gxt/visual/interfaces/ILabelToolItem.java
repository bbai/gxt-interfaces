package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.ILabelToolItemPresenter;
import gxt.visual.interfaces.view.ILabelToolItemView;

import com.extjs.gxt.ui.client.widget.toolbar.LabelToolItem;

/**
 * @author eugenp
 */
public interface ILabelToolItem extends IBoxComponent, ILabelToolItemView, ILabelToolItemPresenter{
	
	/** mine */
	LabelToolItem getComponent();

}
