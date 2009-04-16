package com.gwt.swf.client.upload;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author sharad.gaur
 * 
 */
public class SWFSettings extends JavaScriptObject {
	protected SWFSettings() {
	};

	/**
	 * The upload_url setting accepts a full, absolute, or relative target URL
	 * for the uploaded file. Relative URLs should be relative to document. The
	 * upload_url should be in the same domain as the Flash Control for best
	 * compatibility. If the preserve_relative_urls setting is false SWFUpload
	 * will convert the relative URL to an absolute URL to avoid the URL being
	 * interpreted differently by the Flash Player on different platforms. If
	 * you disable SWFUploads conversion of the URL relative URLs should be
	 * relative to the swfupload.swf file.
	 */
	public native final void setURL(String url)/*-{ this.upload_url=url;}-*/;

	public native final String getURL()/*-{return this.upload_url;}-*/;

	/**
	 * The number of seconds SWFUpload should wait for Flash to detect the
	 * server's response after the file has finished uploading. This setting
	 * allows you to work around the Flash Player bugs where long running server
	 * side scripts causes Flash to ignore the server response or the Mac Flash
	 * Player bug that ignores server responses with no content. Testing has
	 * shown that Flash will ignore server responses that take longer than 30
	 * seconds after the last uploadProgress event. A timeout of zero (0)
	 * seconds disables this feature and is the default value. SWFUpload will
	 * wait indefinitely for the Flash Player to trigger the uploadSuccess
	 * event.
	 */
	public native final void setSuccessTimeout(int val)/*-{ this.assume_success_timeout=val;}-*/;

	public native final int getSuccessTimeout()/*-{return this.assume_success_timeout;}-*/;

	/**
	 * The file_post_name allows you to set the value name used to post the
	 * file. This is not related to the file name. The default value is
	 * 'Filedata'. For maximum compatibility it is recommended that the default
	 * value is used.
	 */
	public native final void setFilePostName(String val)/*-{ this.file_post_name=val;}-*/;

	public native final String getFilePostName()/*-{return this.file_post_name;}-*/;

	/**
	 * The requeue_on_error setting may be true or false. When this setting is
	 * true any files that has an uploadError (excluding fileQueue errors and
	 * the FILE_CANCELLED uploadError) is returned to the front of the queue
	 * rather than being discarded. The file can be uploaded again if needed. To
	 * remove the file from the queue the cancelUpload method must be called.
	 * All the events associated with a failed upload are still called and so
	 * the requeuing the failed upload can conflict with the Queue Plugin (or
	 * custom code that uploads the entire queue). Code that automatically
	 * uploads the next file in the queue will upload the failed file over and
	 * over again if care is not taken to allow the failing upload to be
	 * cancelled. This setting was introduced in SWFUpload v2.1.0.
	 */
	public native final void setRequeueOnError(boolean val)/*-{ this.requeue_on_error=val;}-*/;

	public native final boolean getRequeueOnError()/*-{return this.requeue_on_error;}-*/;

	/**
	 * An array that defines the HTTP Status Codes that will trigger success.
	 * 200 is always a success. Also, only the 200 status code provides the
	 * serverData. When returning and accepting an HTTP Status Code other than
	 * 200 it is not necessary for the server to return content.
	 */
	public final void setHTTPSuccess(int[] val) {
		String tmp = "";
		for (int element : val) {
			tmp = element + ",";
		}
		if (tmp.trim().length() > 0) {
			tmp = tmp.trim().substring(0, tmp.trim().length() - 1);
		}
		tmp = "[" + tmp + "]";
		setHTTPSuccess(tmp);
	}

	/**
	 * An array that defines the HTTP Status Codes that will trigger success.
	 * 200 is always a success. Also, only the 200 status code provides the
	 * serverData. When returning and accepting an HTTP Status Code other than
	 * 200 it is not necessary for the server to return content.
	 */
	public native final void setHTTPSuccess(String val)/*-{ this.http_success=eval(val);}-*/;

	public native final String getHTTPSuccess()/*-{return this.http_success;}-*/;

	/**
	 * The file_size_limit setting defines the maximum allowed size of a file to
	 * be uploaded. This setting accepts a value and unit. Valid units are B,
	 * KB, MB and GB. If the unit is omitted default is KB. A value of 0 (zero)
	 * is interpreted as unlimited. Note: This setting only applies to the
	 * user's browser. It does not affect any settings or limits on the web
	 * server.
	 */
	public native final void setFileSizeLimit(String val)/*-{ this.file_size_limit=val;}-*/;

	public native final String getFileSizeLimit()/*-{return this.file_size_limit;}-*/;

	/**
	 * The file_types setting accepts a semi-colon separated list of file
	 * extensions that are allowed to be selected by the user. Use '*.*' to
	 * allow all file types.
	 */
	public native final void setFileType(String val)/*-{ this.file_types=val;}-*/;

	public native final String getFileType()/*-{return this.file_types;}-*/;

	/**
	 * text description that is displayed to the user in the File Browser
	 * dialog.
	 */
	public native final void setFileTypeDescription(String val)/*-{ this.file_types_description=val;}-*/;

	public native final String getFileTypeDescription()/*-{return this.file_types_description;}-*/;

	/**
	 * Defines the number of files allowed to be uploaded by SWFUpload. This
	 * setting also sets the upper bound of the file_queue_limit setting. Once
	 * the user has uploaded or queued the maximum number of files she will no
	 * longer be able to queue additional files. The value of 0 (zero) is
	 * interpreted as unlimited. Only successful uploads (uploads the trigger
	 * the uploadSuccess event) are counted toward the upload limit. The
	 * setStats function can be used to modify the number of successful uploads.
	 * 
	 * Note: This value is not tracked across pages and is reset when a page is
	 * refreshed. File quotas should be managed by the web server.
	 */
	public native final void setFileUploadLimit(int val)/*-{ this.file_upload_limit=val;}-*/;

	public native final String getFileUploadLimit()/*-{return this.file_upload_limit;}-*/;

	/**
	 * Dynamically modifies the file_queue_limit setting. The special value zero
	 * (0) indicates "no limit".
	 */
	public native final void setFileQueueLimit(int val)/*-{this.file_queue_limit=val;}-*/;

	public native final int getFileQueueLimit()/*-{return this.file_queue_limit;}-*/;

	/**
	 * (Added in v2.2.0) This required setting sets the ID of DOM element that
	 * will be replaced by the Flash Button. This setting overrides the
	 * button_placeholder setting. The Flash button can be styled using the CSS
	 * class 'swfupload'.
	 */
	public native final void setButtonImageURL(String val)/*-{ this.button_image_url=val;}-*/;

	public native final String getButtonImageURL()/*-{return this.button_image_url;}-*/;

	public native final void setButtonWidth(int val)/*-{ this.button_width=val;}-*/;

	public native final int getButtonWidth()/*-{return this.button_width;}-*/;

	public native final void setButtonHeight(int val)/*-{ this.button_height=val;}-*/;

	public native final int getButtonHeight()/*-{return this.button_height;}-*/;

	/**
	 * (Added in v2.2.0) Defines the action taken when the Flash button is
	 * clicked. Valid action values can be found in the swfupload.js file under
	 * the BUTTON_ACTION object.
	 */
	public native final void setButtonAction(int val)/*-{ this.button_action=val;}-*/;

	public native final int getButtonAction()/*-{return this.button_action;}-*/;

	/**
	 * (Added in v2.2.0) This required setting sets the ID of DOM element that
	 * will be replaced by the Flash Button. This setting overrides the
	 * button_placeholder setting. The Flash button can be styled using the CSS
	 * class 'swfupload'.
	 */
	public native final void setButtonPlaceholderId(String val)/*-{ this.button_placeholder_id=val;}-*/;

	public native final String getButtonPlaceholderId()/*-{return this.button_placeholder_id;}-*/;

	/**
	 * (Added in v2.2.0) Plain or HTML text that is displayed over the Flash
	 * button. HTML text can be further styled using CSS classes and the
	 * button_text_style setting. See Adobe's Flash documentation for details.
	 */
	public native final void setButtonHTML(String val)/*-{ this.button_text=val;}-*/;

	public native final String getButtonHTML()/*-{return this.button_text;}-*/;

	/**
	 * (Added in v2.2.0) CSS style string that defines how the button_text is
	 * displayed. See Adobe's Flash documentation for details.
	 */
	public native final void setButtonCss(String val)/*-{ this.button_text_style=val;}-*/;

	public native final String getButtonCss()/*-{return this.button_text_style;}-*/;

	public native final void setButtonTopPadding(int val)/*-{ this.button_text_top_padding=val;}-*/;

	public native final int getButtonTopPadding()/*-{return this.button_text_top_padding;}-*/;

	public native final void setButtonLeftPadding(int val)/*-{ this.button_text_left_padding=val;}-*/;

	public native final int getButtonLeftPadding()/*-{return this.button_text_left_padding;}-*/;

	/**
	 * The full, absolute, or relative URL to the Flash Control swf file. This
	 * setting cannot be changed once the SWFUpload has been instantiated.
	 * Relative URLs are relative to the page URL.
	 */
	public native final void setFlashURL(String val)/*-{ this.flash_url=val;}-*/;

	public native final String getFlashURL()/*-{return this.flash_url;}-*/;

	public final void setEventLitener(SWFEventListener listener) {
		addEventListener(listener);
	}

	public native final void removeEventListener()/*-{
	                    		if (typeof(listener) == "undefined"){
	                    			return;
	                    		}
	                    		
	                    		listener = null;
	                    		
	                    	
	                    	}-*/;

	private native final void addEventListener(SWFEventListener lstnr)/*-{
	                    		var listener = lstnr;
	                    		var gl_swfUploadLoaded=function(){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::swfUploadLoaded()();
	                    		}
	                    		
	                    		var gl_uploadProgress=function(file, bytesLoaded, totalBytes){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::uploadProgress(IILcom/gwt/swf/client/upload/FileObject;)(bytesLoaded,totalBytes,eval(file));
	                    		}
	                    		var gl_uploadError=function(file, errorCode, message){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::uploadError(ILjava/lang/String;Lcom/gwt/swf/client/upload/FileObject;)(errorCode,message,file);
	                    		}
	                    		
	                    		var gl_uploadSuccess=function(file, serverData, receivedResponse){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::uploadSuccess(ZLjava/lang/String;Lcom/gwt/swf/client/upload/FileObject;)(receivedResponse,serverData,eval(file));
	                    		}
	                    		var gl_uploadComplete=function(file){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::uploadComplete(Lcom/gwt/swf/client/upload/FileObject;)(eval(file));
	                    		}
	                    		
	                    		var gl_file_dialog_start_function = function(){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::fileDialogStart()();
	                    		}
	                    		
	                    		var gl_file_queued_function = function(file){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::fileQueued(Lcom/gwt/swf/client/upload/FileObject;)(file);
	                    		}
	                    		
	                    		var gl_file_queue_error_function = function(file,errorCode,message){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::fileQueueError(ILjava/lang/String;Lcom/gwt/swf/client/upload/FileObject;)(errorCode,message,file);
	                    		}
	                    		var gl_file_dialog_complete_function = function(sel,qu,tqu){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::fileDialogComplete(III)(sel,qu,tqu);
	                    		}
	                    		var gl_upload_start_function = function(file){
	                    			listener.@com.gwt.swf.client.upload.SWFEventListener::uploadStart(Lcom/gwt/swf/client/upload/FileObject;)(file);
	                    		}
	                    		
	                    		this.swfupload_loaded_handler=gl_swfUploadLoaded;
	                    		this.upload_progress_handler=gl_uploadProgress;
	                    		this.upload_error_handler=gl_uploadError;
	                    		this.upload_success_handler=gl_uploadSuccess;
	                    		this.upload_complete_handler=gl_uploadComplete;
	                    		
	                    		this.file_dialog_start_handler=gl_file_dialog_start_function;
	                    		this.file_queued_handler=gl_file_queued_function;
	                    		this.file_queue_error_handler=gl_file_queue_error_function;
	                    		this.file_dialog_complete_handler=gl_file_dialog_complete_function;
	                    		this.upload_start_handler=gl_upload_start_function;
	                    	
	                    	}-*/;

}
