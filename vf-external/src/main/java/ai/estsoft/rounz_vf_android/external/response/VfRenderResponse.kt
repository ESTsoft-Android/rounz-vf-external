package ai.estsoft.rounz_vf_android.external.response

sealed class VfRenderResponse {
    class Success(val url: String) : VfRenderResponse()
    class Failure(val throwable: Throwable) : VfRenderResponse()
}