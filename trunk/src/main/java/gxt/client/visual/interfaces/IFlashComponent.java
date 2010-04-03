package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.flash.FlashComponent;

import gxt.client.visual.interfaces.presenter.IFlashComponentPresenter;
import gxt.client.visual.interfaces.view.IFlashComponentView;

/**
 * @author eugenp
 */
public interface IFlashComponent extends IBoxComponent, IFlashComponentView, IFlashComponentPresenter{
	
	/** mine */
	FlashComponent getComponent();

}
