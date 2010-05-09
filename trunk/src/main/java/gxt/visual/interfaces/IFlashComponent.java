package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.flash.FlashComponent;

import gxt.visual.interfaces.presenter.IFlashComponentPresenter;
import gxt.visual.interfaces.view.IFlashComponentView;

/**
 * @author eugenp
 */
public interface IFlashComponent extends IBoxComponent, IFlashComponentView, IFlashComponentPresenter{
	
	/** mine */
	FlashComponent getComponent();

}
