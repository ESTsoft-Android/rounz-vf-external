package ai.estsoft.rounz_vf_android.external.response

sealed class DownloadVFResourceResponse {
    object Success : DownloadVFResourceResponse()

    class Failure(val throwable: Throwable) : DownloadVFResourceResponse()
}