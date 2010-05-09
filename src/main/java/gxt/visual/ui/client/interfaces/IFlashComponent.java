package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.flash.FlashComponent;

import gxt.visual.ui.client.interfaces.presenter.IFlashComponentPresenter;
import gxt.visual.ui.client.interfaces.view.IFlashComponentView;

/**
 * @author eugenp
 */
public interface IFlashComponent extends IBoxComponent, IFlashComponentView, IFlashComponentPresenter{
	
	/** mine */
	FlashComponent getComponent();

}
