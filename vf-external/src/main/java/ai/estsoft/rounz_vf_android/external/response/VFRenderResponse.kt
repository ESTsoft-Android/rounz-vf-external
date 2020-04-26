package ai.estsoft.rounz_vf_android.external.response

sealed class VFRenderResponse {
    class Success(val url: String) : VFRenderResponse()
    class Failure(val throwable: Throwable) : VFRenderResponse()
}