package gxt.visual.ui.client.interfaces;

import gxt.visual.ui.client.interfaces.presenter.IFileUploadFieldPresenter;
import gxt.visual.ui.client.interfaces.view.IFileUploadFieldView;

import com.extjs.gxt.ui.client.widget.form.FileUploadField;

/**
 * @author eugenp
 */
public interface IFileUploadField extends ITextField< String >, IFileUploadFieldPresenter, IFileUploadFieldView{
	
	/** mine */
	FileUploadField getComponent();

}
