package ai.estsoft.rounz_vf_android.external.response

sealed class DownloadVfResourceResponse {
    object Success : DownloadVfResourceResponse()

    class Failure(val throwable: Throwable) : DownloadVfResourceResponse()
}