package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IFillToolItemPresenter;
import gxt.visual.interfaces.view.IFillToolItemView;

import com.extjs.gxt.ui.client.widget.toolbar.FillToolItem;

/**
 * @author eugenp
 */
public interface IFillToolItem extends IComponent, IFillToolItemPresenter, IFillToolItemView{
	
	/** mine */
	FillToolItem getComponent();

}
