import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.ton.api.liteclient.config.LiteClientConfigGlobal

val GLOBAL_CONFIG_JSON = """
 {
   "@type": "config.global",
   "dht": {
     "@type": "dht.config.global",
     "k": 6,
     "a": 3,
     "static_nodes": {
       "@type": "dht.nodes",
       "nodes": [
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "C1uy64rfGxp10SPSqbsxWhbumy5SM0YbvljCudwpZeI="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1307380867,
                 "port": 15888
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "s+tnHMTzPYG8abau+1dUs8tBJ+CDt+jIPmGfaVd7nmfb1gt6lL10G2IwkNeWhkxjZcAHRc0azWFVxp+IjIOOBQ=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "bn8klhFZgE2sfIDfvVI6m6+oVNi1nBRlnHoxKtR9WBU="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1307380860,
                 "port": 15888
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "fQ5zAa6ot4pfFWzvuJOR8ijM5ELWndSDsRhFKstW1tqVSNfwAdOC7tDC8mc4vgTJ6fSYSWmhnXGK/+T5f6sDCw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "KlNrfVSyO6oISNi4Bx8J2klAN4RnKmEPQpfr1bghGSk="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1307380856,
                 "port": 15888
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "0/1trU+HDc+Co/q8gw5lPrSJH9YCOXxVh0caR2CGqXE5820DguuSmVnnLQ9S2+RmxHv0biYZuH8FiJv2wPwyDA=="
         },
         {
             "@type": "dht.node",
             "id": {
                 "@type": "pub.ed25519",
                 "key": "6PGkPQSbyFp12esf1NqmDOaLoFA8i9+Mp5+cAx5wtTU="
             },
             "addr_list": {
                 "@type": "adnl.addressList",
                 "addrs": [
                     {
                         "@type": "adnl.address.udp",
                         "ip": -1185526007,
                         "port": 22096
                     }
                 ],
                 "version": 0,
                 "reinit_date": 0,
                 "priority": 0,
                 "expire_at": 0
             },
             "version": -1,
             "signature": "L4N1+dzXLlkmT5iPnvsmsixzXU0L6kPKApqMdcrGP5d9ssMhn69SzHFK+yIzvG6zQ9oRb4TnqPBaKShjjj2OBg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "4R0C/zU56k+x2HGMsLWjX2rP/SpoTPIHSSAmidGlsb8="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1952265919,
                 "port": 14395
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "0uwWyCFn2KjPnnlbSFYXLZdwIakaSgI9WyRo87J3iCGwb5TvJSztgA224A9kNAXeutOrXMIPYv1b8Zt8ImsrCg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "/YDNd+IwRUgL0mq21oC0L3RxrS8gTu0nciSPUrhqR78="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1402455171,
                 "port": 14432
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "6+oVk6HDtIFbwYi9khCc8B+fTFceBUo1PWZDVTkb4l84tscvr5QpzAkdK7sS5xGzxM7V7YYQ6gUQPrsP9xcLAw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "DA0H568bb+LoO2LGY80PgPee59jTPCqqSJJzt1SH+KE="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1402397332,
                 "port": 14583
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "cL79gDTrixhaM9AlkCdZWccCts7ieQYQBmPxb/R7d7zHw3bEHL8Le96CFJoB1KHu8C85iDpFK8qlrGl1Yt/ZDg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "fZnkoIAxrTd4xeBgVpZFRm5SvVvSx7eN3Vbe8c83YMk="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 1091897261,
                 "port": 15813
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "cmaMrV/9wuaHOOyXYjoxBnckJktJqrQZ2i+YaY3ehIyiL3LkW81OQ91vm8zzsx1kwwadGZNzgq4hI4PCB/U5Dw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "zDBLsKjns4bBqQokzY0wOzC2vwbOeiE1J7aOjfCp5mg="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1573440928,
                 "port": 12821
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "qORMhem9RyG7wnNYF822YL3EXwEoTO82h2TarFbjd0jikMIGizAdir1JyxSfyKkhHdFKGcLMeoPb2dfMIvQwAA=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "CU9ytJok8WBnpl29T740gfC/h69kgvQJp7FJMq/N60g="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 391653587,
                 "port": 15895
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "DKyGF2nPRxmerpIHxE5FN1Lod3zvJu728NP0iYc1hpNyPvl5epu+7amjimLy1VdzNqFzTJAoJ/gqPPMkXS/kDw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "d1lL6xZO8UWMzkWD++8Yr3hf6585X6qoOZZTeLtGl4o="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1537553981,
                 "port": 18513
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "sDxyCuvZmi9fJvQl4DEBKZOlt532xflnVD1dvC2ia2Na5MN8dT6x4HizEpS4pUqky8LzR/A/4BCqIQXhD45vDg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "SP2Bjle9u+GoZhlEhm3mIPiND3Yh+Nr7QsgV6bGPw/I="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1591529174,
                 "port": 11369
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "qbbeE53SOyUvOWD2hIZmTyZGY4k2XHxgldqBIakBma33oC5sWDD/+cApuFLMbi2Gnd6fQtQ3LaZtfQzJrCiYAw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "76SsMv8NrqzkCFEVumZEx2phYYSUZvSH3UlUTuPdZYk="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1906451518,
                 "port": 16937
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "YgrIN/KH3XVPyk09wgZbFaXLZ/BeGjvfO6ohxN4M8Tp/CsYN0G3tNLSjJGeuH22bIKMFRoEpp3v7Sz54Q/FTCg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "IHrCooudVGonmudcmTZYk+Pfdsxz2NGws33bHtXnOv8="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1882838653,
                 "port": 41623
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "pm3PQn0ZYQH7SkmK/8q4p1igFKxJSQLCmVcFtyaRxEV9ecjvB5PiW3o3wfrTRPk0v0mnFmH8UuYtLEztj+LcBw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "eDPKd9v6aHhutnHU3z2ykV4eUA3LdFI+oSBg6z8JyS0="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1481864647,
                 "port": 22261
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "InY5jkkQ6fuJtutkmlPLYEhqQ0F4DyEhqoPB4KMBIJc8hhZFzm4jNAxSfy3VVQbACdJ/pj76qbjaktG/m1ipDQ=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "znOAvy1ECxyzeKishi4PdSO2edaVx78wynVyNKLBmQ8="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1068377703,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "KLH17nNKmOk3carKwbsUcVBc4JZpdAUdUOMxe8FSyqnkOw/lolnltbylJcC+lvPpIV5ySI/Qx8UZdNRV/4HzCA=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "Qjhv9rmeqXm0a+nYYhCJG1AH7C2TM6DAmyIM3FgO0Eo="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1057912003,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "2Gw5eIsZR+SdbWCU139DCuBI8Rv8T9iUioxDkgV6/IjcCHf6hNz8WCyUsKd5l5P1NBs/kdaxUBIybINDpYXoCw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "2YsTRIu3aRYzZe8eoR8PK2N2ydHJyKllwKcLPk676d4="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1057911744,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "9/TJsaj0wELvRKXVIrBdyZWjgLKhfSvl7v0Oqq/9p9MsU/t9iRuGcpAzHqQF4bQAWrN8j9ARwMumRata7dH8Bg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "SHrXmMEEUBGa51TWZwHSA+2RF4Vyavw51jgtnAz1ypU="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -1057911148,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "R4ku8+tvjKSLIGe18zWHBHDv1maQHD5tGbAUOgbldGpBvfqH+/b76XkJjJzDsjnCO/bpxwUZfcI1sM1h6vFJCQ=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "G+Lr6UtSWUcyYHTUutwbxrIG9GGZan3h96j8qQPLIXQ="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -960017601,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "fWU9hSNLvmaSCQOBW9M4Lja5pIWcqOzU1g9vtSywdgtASj9oQpwAslvr2sjNh9E2Np1c26NW8Sc5gUKf8YY7BA=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "/tp8WsXfk/XpzOyaaxuOlvbOhDoH7/L81eWi0QMn0gg="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 84478511,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "2kA9P0LBI7H8gmmGsnZ2bQPZP3rZDFugrc5zQWlFrPIMLvwH7/J69HIGCVYgcaEsf0HMnIJeUMl5n4qFp0quBQ=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "fnYl5kAHcbhK65FbYxfwk83X1Sn6ZiuXWMD0F0Rh+v4="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 84478479,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "h+K+YttdhqE4LzihZTnKLFBiXyY79Rqqcx8dCbkDVXu3FD7ZrTBNV5b/bf7BQbuF0PXTc7YqH0jEmqz8aX6aBg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "HwOhm4Vh1YGqBNmUrDwJpeo8kXAPI7J3sSH38JaAyzQ="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -2018145068,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "Ianf1Wm9Y6HT9r32LFNUieKi86cSBbCckczHy+ZyBo15MpIsZxouUgfAyeW20sZm1hN5+Yx4lPwzL+Ovm6KaCw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "CXo+qxdYclubZqoqvVhoeYDdPV+VhlWcurf2OX0iPZs="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -2018145059,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "P72kraIX5pIxQBnh7It4kyK6MPuZ56ZFZKZxegtrxwx/Vpi1wQ4PsfxWf6N0HojbNMYsVZsvwHYTLxj5nhd6Dw=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "KiKtUV+kJWBd+M29zNvtRqdvUrtX4lfi5CyY+DRm+lk="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 1091931625,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "GjarYvxTVPik8m5yI9Eq/1lW/8CuReBdhUdFUb4wJJVVc/EvHf7j47mY5ECskHjeo9MYttgF/9KQaf8KNea1Dg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "o15mg8SB9CY2m971NvU+aCzAEnZFg3iAnIsqBMmqnj0="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 1091931590,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "6mJPM7RZMOL5uCMRCGINjxAG7L7LHt7o89caD7Kk75ahpwAhqJ3ri9zL1rzJZjmyOMLkPoGcckJsG8phCRbVDQ=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "VCu471G41Hj8onyyeJdq8t6AZu3SR7BoGuCLs8SppBk="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 1091931623,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "7cOhypsjGb4xczR20M6eg7ly8sdvzdodkKVXzvr00FsXHcguz6bP0zm/dwhiQgsJgSosYypCk/LvKQrMy+C3AQ=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "0uEnHB6Rg4sVjiepDgHoZ3CuKjCRjU3ul4IGmmZZoig="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": 1091931589,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "ju40qeS5mgbJDMLUxL7qSquSdqgo3Uib4Z/Va/bpIWJJA0W3VQStJMBbV/pQySi6MoM794Du3o8Gl1bjdpwDAg=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "MJr8xja0xpu9DoisFXBrkNHNx1XozR7HHw9fJdSyEdo="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -2018147130,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "XcR5JaWcf4QMdI8urLSc1zwv5+9nCuItSE1EDa0dSwYF15R/BtJoKU5YHA4/T8SiO18aVPQk2SL1pbhevuMrAQ=="
         },
         {
           "@type": "dht.node",
           "id": {
             "@type": "pub.ed25519",
             "key": "Fhldu4zlnb20/TUj9TXElZkiEmbndIiE/DXrbGKu+0c="
           },
           "addr_list": {
             "@type": "adnl.addressList",
             "addrs": [
               {
                 "@type": "adnl.address.udp",
                 "ip": -2018147075,
                 "port": 6302
               }
             ],
             "version": 0,
             "reinit_date": 0,
             "priority": 0,
             "expire_at": 0
           },
           "version": -1,
           "signature": "nUGB77UAkd2+ZAL5PgInb3TvtuLLXJEJ2icjAUKLv4qIGB3c/O9k/v0NKwSzhsMP0ljeTGbcIoMDw24qf3goCg=="
         }
       ]
     }
   },
   "liteservers": [
     {
       "ip": 84478511,
       "port": 19949,
       "id": {
         "@type": "pub.ed25519",
         "key": "n4VDnSCUuSpjnCyUk9e3QOOd6o0ItSWYbTnW3Wnn8wk="
       }
     },
     {
       "ip": 84478479,
       "port": 48014,
       "id": {
         "@type": "pub.ed25519",
         "key": "3XO67K/qi+gu3T9v8G2hx1yNmWZhccL3O7SoosFo8G0="
       }
     },
     {
       "ip": -2018135749,
       "port": 53312,
       "id": {
         "@type": "pub.ed25519",
         "key": "aF91CuUHuuOv9rm2W5+O/4h38M3sRm40DtSdRxQhmtQ="
       }
     },
     {
       "ip": -2018145068,
       "port": 13206,
       "id": {
         "@type": "pub.ed25519",
         "key": "K0t3+IWLOXHYMvMcrGZDPs+pn58a17LFbnXoQkKc2xw="
       }
     },
     {
       "ip": -2018145059,
       "port": 46995,
       "id": {
         "@type": "pub.ed25519",
         "key": "wQE0MVhXNWUXpWiW5Bk8cAirIh5NNG3cZM1/fSVKIts="
       }
     },
     {
       "ip": 1091931625,
       "port": 30131,
       "id": {
         "@type": "pub.ed25519",
         "key": "wrQaeIFispPfHndEBc0s0fx7GSp8UFFvebnytQQfc6A="
       }
     },
     {
       "ip": 1091931590,
       "port": 47160,
       "id": {
         "@type": "pub.ed25519",
         "key": "vOe1Xqt/1AQ2Z56Pr+1Rnw+f0NmAA7rNCZFIHeChB7o="
       }
     },
     {
       "ip": 1091931623,
       "port": 17728,
       "id": {
         "@type": "pub.ed25519",
         "key": "BYSVpL7aPk0kU5CtlsIae/8mf2B/NrBi7DKmepcjX6Q="
       }
     },
     {
       "ip": 1091931589,
       "port": 13570,
       "id": {
         "@type": "pub.ed25519",
         "key": "iVQH71cymoNgnrhOT35tl/Y7k86X5iVuu5Vf68KmifQ="
       }
     },
     {
       "ip": -1539021362,
       "port": 52995,
       "id": {
         "@type": "pub.ed25519",
         "key": "QnGFe9kihW+TKacEvvxFWqVXeRxCB6ChjjhNTrL7+/k="
       }
     },
     {
       "ip": -1539021936,
       "port": 20334,
       "id": {
         "@type": "pub.ed25519",
         "key": "gyLh12v4hBRtyBygvvbbO2HqEtgl+ojpeRJKt4gkMq0="
       }
     },
     {
       "ip": -1136338705,
       "port": 19925,
       "id": {
         "@type": "pub.ed25519",
         "key": "ucho5bEkufbKN1JR1BGHpkObq602whJn3Q3UwhtgSo4="
       }
     },
     {
       "ip": 868465979,
       "port": 19434,
       "id": {
         "@type": "pub.ed25519",
         "key": "J5CwYXuCZWVPgiFPW+NY2roBwDWpRRtANHSTYTRSVtI="
       }
     },
     {
       "ip": 868466060,
       "port": 23067,
       "id": {
         "@type": "pub.ed25519",
         "key": "vX8d0i31zB0prVuZK8fBkt37WnEpuEHrb7PElk4FJ1o="
       }
     },
     {
       "ip": -2018147130,
       "port": 53560,
       "id": {
         "@type": "pub.ed25519",
         "key": "NlYhh/xf4uQpE+7EzgorPHqIaqildznrpajJTRRH2HU="
       }
     },
     {
       "ip": -2018147075,
       "port": 46529,
       "id": {
         "@type": "pub.ed25519",
         "key": "jLO6yoooqUQqg4/1QXflpv2qGCoXmzZCR+bOsYJ2hxw="
       }
     },
     {
       "ip": 908566172,
       "port": 51565,
       "id": {
         "@type": "pub.ed25519",
         "key": "TDg+ILLlRugRB4Kpg3wXjPcoc+d+Eeb7kuVe16CS9z8="
       }
     },
     {
         "ip": -1185526007,
         "port": 4701,
         "id": {
             "@type": "pub.ed25519",
             "key": "G6cNAr6wXBBByWDzddEWP5xMFsAcp6y13fXA8Q7EJlM="
         }
     }
   ],
   "validator": {
     "@type": "validator.config.global",
     "zero_state": {
       "workchain": -1,
       "shard": -9223372036854775808,
       "seqno": 0,
       "root_hash": "F6OpKZKqvqeFp6CQmFomXNMfMj2EnaUSOXN+Mh+wVWk=",
       "file_hash": "XplPz01CXAps5qeSWUtxcyBfdAo5zVb1N979KLSKD24="
     },
     "init_block": {
       "root_hash": "X9KHJorLeUrMmiE+J6jw9e01E+3EHRiyRVxDv9cydPg=",
       "seqno": 24001954,
       "file_hash": "uUppFBsq1He9SGLugrrynECQ/1XY4inPYBH9DUPd7TY=",
       "workchain": -1,
       "shard": -9223372036854775808
     },
     "hardforks": [
       {
         "file_hash": "t/9VBPODF7Zdh4nsnA49dprO69nQNMqYL+zk5bCjV/8=",
         "seqno": 8536841,
         "root_hash": "08Kpc9XxrMKC6BF/FeNHPS3MEL1/Vi/fQU/C9ELUrkc=",
         "workchain": -1,
         "shard": -9223372036854775808
       }
     ]
   }
 }
""".trimIndent()

val JSON = Json {
    ignoreUnknownKeys = true
}

val GLOBAL_CONFIG = JSON.decodeFromString<LiteClientConfigGlobal>(GLOBAL_CONFIG_JSON)
