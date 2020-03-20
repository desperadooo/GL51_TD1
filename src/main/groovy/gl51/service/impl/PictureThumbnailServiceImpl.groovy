package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.PictureThumbnailService
import gl51.service.PictureWatermarkService

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PictureThumbnailServiceImpl implements PictureThumbnailService {
    Picture thumbnail() {
        Picture p = PictureFetchService.fetchPicture()
        p.height(50)
        p.width(50)
        PictureWatermarkService.watermark(p)
        return p
    }

}