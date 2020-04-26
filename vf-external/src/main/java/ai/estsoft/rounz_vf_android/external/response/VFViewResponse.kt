package ai.estsoft.rounz_vf_android.external.response

sealed class VFViewResponse {
    object NotSupportedWebGL : VFViewResponse()
    object ConfigResourceLoadFailure : VFViewResponse()
    object ProfileResourceLoadFailure : VFViewResponse()
    object ProductResourceLoadFailure : VFViewResponse()
    object NotSupportedColorLensProfile : VFViewResponse()

    object UnknownError : VFViewResponse()
}