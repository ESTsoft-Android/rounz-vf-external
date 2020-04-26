package ai.estsoft.rounz_vf_android.external.response

sealed class VFActionResponse {
    class Success(val url: String) : VFActionResponse()
    class Failure(val throwable: Throwable) : VFActionResponse()
}