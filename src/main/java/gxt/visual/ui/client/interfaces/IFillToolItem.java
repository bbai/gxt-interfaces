package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IFillToolItemPresenter;
import gxt.visual.ui.client.interfaces.view.IFillToolItemView;

import com.extjs.gxt.ui.client.widget.toolbar.FillToolItem;

/**
 * @author eugenp
 */
public interface IFillToolItem extends IComponent, IFillToolItemPresenter, IFillToolItemView{
	
	/** mine */
	FillToolItem getComponent();

}
