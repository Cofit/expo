package abi35_0_0.host.exp.exponent.modules.api.components.webview;

import android.support.v4.content.FileProvider;

/**
 * Providing a custom {@code FileProvider} prevents manifest {@code <provider>} name collisions.
 * <p>
 * See https://developer.android.com/guide/topics/manifest/provider-element.html for details.
 */
public class RNCWebViewFileProvider extends FileProvider {

  // This class intentionally left blank.

}
