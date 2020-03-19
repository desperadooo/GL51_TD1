package gl51.service

import gl51.data.Picture

interface PictureWatermarkService {
    Picture watermark(Picture p)
}