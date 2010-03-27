package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IFillToolItemPresenter;
import gxt.client.visual.interfaces.view.IFillToolItemView;

import com.extjs.gxt.ui.client.widget.toolbar.FillToolItem;

/**
 * @author eugenp
 */
public interface IFillToolItem extends IComponent, IFillToolItemPresenter, IFillToolItemView{
	
	/** mine */
	FillToolItem getComponent();

}
