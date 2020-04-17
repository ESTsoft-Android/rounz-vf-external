package ai.estsoft.rounz_vf_android.external.response

sealed class VfViewResponse {
    object NotSupportedWebGL : VfViewResponse()
    object ConfigResourceLoadFailure : VfViewResponse()
    object ProfileResourceLoadFailure : VfViewResponse()
    object ProductResourceLoadFailure : VfViewResponse()
    object NotSupportedColorLensProfile : VfViewResponse()

    object UnknownError : VfViewResponse()
}