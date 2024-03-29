package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.response.DownloadVFResourceResponse

interface VFResource {
    /**
     * 피팅을 위한 공통 리소스를 다운로드 합니다.
     *
     * @param url 리소스 서버 url
     * @return 리소스 다운로드 결과
     */
    fun downloadVFCommonResource(
        url: String
    ): DownloadVFResourceResponse

    /**
     * 상품 ID에 대한 VF 리소스를 다운로드 합니다.
     *
     * @param vfResourceId 다운받을 리소스 ID
     * @param vfResourceUrl 다운로드 할 리소스 URL 주소
     * @return 리소스 다운로드 결과
     */
    fun downloadVFResource(
        vfResourceId: String,
        vfResourceUrl: String
    ): DownloadVFResourceResponse
}