package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.response.DownloadVfResourceResponse

interface VfResource {
    /**
     * 피팅을 위한 전반적인 리소스를 다운로드 합니다.
     *
     * @param url 리소스 서버 url
     * @return 리소스 다운로드 결과
     */
    fun downloadCollections(
        url: String
    ): DownloadVfResourceResponse

    /**
     * 상품 ID에 대한 VF 리소스를 다운로드 합니다.
     *
     * @param productId 다운받을 상품 ID
     * @param vfResourceUrl 다운로드 할 URL 주소
     * @return 리소스 다운로드 결과
     */
    fun downloadProduct(
        productId: Int,
        vfResourceUrl: String
    ): DownloadVfResourceResponse
}