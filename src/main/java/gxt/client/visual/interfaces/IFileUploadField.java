package gxt.client.visual.interfaces;

import gxt.client.visual.interfaces.presenter.IFileUploadFieldPresenter;
import gxt.client.visual.interfaces.view.IFileUploadFieldView;

import com.extjs.gxt.ui.client.widget.form.FileUploadField;

/**
 * @author eugenp
 */
public interface IFileUploadField extends ITextField< String >, IFileUploadFieldPresenter, IFileUploadFieldView{
	
	/** mine */
	FileUploadField getComponent();

}
